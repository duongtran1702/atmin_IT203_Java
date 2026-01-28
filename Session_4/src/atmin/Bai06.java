package atmin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai06 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] blacklist = {"tệ", "ngu ngốc", "đáng đọc"};

        String regex = "(?i)(" + String.join("|", blacklist) + ")";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            String match = matcher.group();
            matcher.appendReplacement(sb, "*".repeat(match.length()));
        }
        matcher.appendTail(sb);
        String processedReview = sb.toString();
        
        if (processedReview.length() > 200) {
            int cutIndex = processedReview.lastIndexOf(" ", 200);
            if (cutIndex != -1) {
                processedReview = processedReview.substring(0, cutIndex) + "...";
            } else {
                processedReview = processedReview.substring(0, 200) + "...";
            }
        }

        System.out.println("Review sau khi xử lý: " + processedReview);
    }
}
