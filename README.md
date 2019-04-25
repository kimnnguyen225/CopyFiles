# Copy Text File

- Copy text file using 3 closable objects FileReader to read source file, BufferedReader with readLine() method to read one line at a time, and FileWriter with it's write() method to write each line with line feed "\n" to targeted file. I use while loop to create an infinite loop to read each line until there is no line to read, which is == null, Java will break out of the loop.

- The 3 closable objects are instantiated inside try/catch (try-with-resources) so Java runtime can call the close() method that these objects implement from AutoClosable interface. 
