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

With args
```bash
java -jar HtmlToPdf.jar "<body>Hello World</body>" > hello_world.pdf
```
You can also use standard in
```bash
echo "<body>Hello World</body>" | java -jar HtmlToPdf.jar > hello_world.pdf
```

## Using ruby?
Consider using [pdftool](https://github.com/Agowan/pdftool)