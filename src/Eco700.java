import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eco700 {
    public static void main(String[] args) {
        // 예시 텍스트
        String exampleText = "SWIFT (Society for Worldwide Interbank Financial Telecommunication)는 금융거래 " +
                "관련 메시지를 안전하고 효율적으로 주고받기 위해 유럽지역 은행들이 1973년 5월 " +
                "브뤼셀에 설립한 금융통신망이다.\n" +
                "TED 스프레드는 원래 미국 단기국채(T-Bill) 선물금리와 유로달러 선물금리 간 차이 " +
                "로, 영문 약어 TED는 T-bill의 ‘T’와 유로달러 선물을 의미하는 ‘ED’에서 유래하였다.";

        // 용어와 설명 분리하여 출력
        Map<String, String> termsAndDefinitions = extractTermsAndDefinitions(exampleText);
        for (Map.Entry<String, String> entry : termsAndDefinitions.entrySet()) {
            System.out.println("용어: " + entry.getKey());
            System.out.println("설명: " + entry.getValue());
            System.out.println("----------");
        }
    }



    // 용어와 설명 추출하는 메서드
    public static Map<String, String> extractTermsAndDefinitions(String text) {
        Map<String, String> termsAndDefinitions = new HashMap<>();
        // 정규 표현식을 사용하여 용어와 설명 추출
        Pattern pattern = Pattern.compile("([A-Z][A-Z\\s/-]+)\\s*\\([^)]*\\)?\\s*:\\s*([^A-Z]+)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String term = matcher.group(1).trim();
            String definition = matcher.group(2).trim();
            termsAndDefinitions.put(term, definition);
        }
        return termsAndDefinitions;
    }
}