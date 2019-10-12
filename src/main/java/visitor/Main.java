package visitor;


import org.objectweb.asm.util.TraceClassVisitor;
import org.objectweb.asm.ClassReader;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        ClassReader classReader = new ClassReader("java.lang.String");
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(new PrintWriter(System.out));
        classReader.accept(traceClassVisitor,1);
    }
}
