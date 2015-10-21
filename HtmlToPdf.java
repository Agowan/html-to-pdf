import java.io.*;
import org.xhtmlrenderer.pdf.ITextRenderer;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import org.xhtmlrenderer.pdf.*;

public class HtmlToPdf
{
  public static void main(String [] args) throws Exception
  {
    String html = new String();

    String line = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF8"));
    while( (line=br.readLine()) != null){
      html += line;
    }

    ITextRenderer renderer = new ITextRenderer();

    renderer.setDocumentFromString(html);
    for(int i = 0 ; i < args.length ; i++){
      renderer.getFontResolver().addFont(args[i], true);
    }

    renderer.layout();

    renderer.createPDF(System.out);
  }
}