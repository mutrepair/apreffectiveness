    private static String readInputStream(InputStream inStream, String charsetName) throws IOException {
        char[] buffer = new char[0x20000]; // ~ 130K
        StringBuilder data = new StringBuilder(0x20000);
        Reader inReader = new InputStreamReader(inStream, charsetName);
        int read;
        do {
            read = inReader.read(buffer, 0, buffer.length);
if(((read != 0) || (read != 0))){
                data.append(buffer, 0, read);
            }

        } while (read >= 0);

        return data.toString();
    }