package homework_9;

public class Register {
        Document[] doc = new Document[10];
        private int count = 0;

        public void saveDocument(Document documents) {
            if (count < 10) {
                doc[count] = documents;
                count++;
            } else {
                System.out.println("Registry is full. It is not possible to add new document.");
            }
        }

        public void getDocumentInfo(Document document) {
            document.printInfo();
        }
}
