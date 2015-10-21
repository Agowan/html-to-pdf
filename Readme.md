#HtmlToPdf
This simle library when I had to much problems with other known html to pdf libraries.

## Howto create jar
First just standard java compile
```bash
javac -cp core-renderer-R8.jar:itext-2.0.8.jar HtmlToPdf.java
```
Then bundle it in a jar in order to execute it in a single file
```bash
jar cfm HtmlToPdf.jar manifest.txt HtmlToPdf.class
```

## Usage
The file will return the pdf on standard out for you to do as you please with the file.

Without fonts
```bash
echo "<body>Hello World</body>" | java -jar HtmlToPdf.jar > hello_world.pdf
```

With fonts
```bash
echo "<body style="font-family: Arial">Hello World</body>" | java -jar HtmlToPdf.jar /path/to/Arial.ttf > hello_world.pdf
```

## Using ruby?
Consider using [pdftool](https://github.com/Agowan/pdftool)