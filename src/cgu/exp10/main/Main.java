package cgu.exp10.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cgu.exp10.POJO.Stamp;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
        String config_loc = "/cgu/exp10/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<!DOCTYPE html>\n");
        htmlContent.append("<html>\n");
        htmlContent.append("<head>\n");
        htmlContent.append("<title>Stamp Collection</title>\n");
        htmlContent.append("</head>\n");
        htmlContent.append("<body>\n");
        htmlContent.append("<h1>STAMP COLLECTION FROM DIFFERENT COUNTRIES</h1>\n");
        htmlContent.append("<table border='1'>\n");
        htmlContent.append("<tr><th>Id</th><th>Name</th><th>Origin</th><th>Image</th></tr>\n");

        addStampToTable(context, htmlContent, "stampID1");
        addStampToTable(context, htmlContent, "stampID2");
        addStampToTable(context, htmlContent, "stampID3");

        htmlContent.append("</table>\n");
        htmlContent.append("</body>\n");
        htmlContent.append("</html>");

        // Write HTML content to a file
        writeHtmlToFile(htmlContent.toString(), "stamp_collection.html");
    }

    private static void addStampToTable(ApplicationContext context, StringBuilder htmlContent, String beanId) {
        Stamp stamp = (Stamp) context.getBean(beanId);
        htmlContent.append("<tr>");
        htmlContent.append("<td>").append(stamp.getId()).append("</td>");
        htmlContent.append("<td>").append(stamp.getName()).append("</td>");
        htmlContent.append("<td>").append(stamp.getOrigin()).append("</td>");
        htmlContent.append("<td><img src='").append(stamp.getImageUrl()).append("' alt='Stamp Image' "
        		+ "style='width:100px; height:100px;'></td>");
        htmlContent.append("</tr>\n");
    }

    private static void writeHtmlToFile(String htmlContent, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(htmlContent);
            System.out.println("HTML file generated successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing HTML file: " + e.getMessage());
        }
    }
}
