package ch17;

interface Printable {
	void print(String doc);
	default void printCMYK1(String doc) { }
}
