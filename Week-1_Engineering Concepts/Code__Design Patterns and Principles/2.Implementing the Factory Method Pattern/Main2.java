public class Main2 {
    public static void main(String[] args) {
        DocumentFactory word=new WordDocumentFactory() ;
        Document wordDoc=word.createDocument();
        wordDoc.open();

        DocumentFactory pdf=new PdfDocumentFactory();
        Document pdfDoc=pdf.createDocument();
        pdfDoc.open();

        DocumentFactory exel=new ExcelDocumentFactory();
        Document exelDoc=exel.createDocument();
        exelDoc.open();

    }
}
