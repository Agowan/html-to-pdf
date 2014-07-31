import java.io.*;
import org.xhtmlrenderer.pdf.ITextRenderer;

public class HtmlToPdf
{
  public static void main(String [] args) throws Exception
  {
    String html = new String();
    if(args.length > 0){
      html = args[0];
    } else {
      String line = "";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF8"));
      while( (line=br.readLine()) != null){
        html += line;
      }
    }

    ITextRenderer renderer = new ITextRenderer();

    renderer.setDocumentFromString(html);

    renderer.layout();

    renderer.createPDF(System.out);
  }
}