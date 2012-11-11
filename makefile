JAVAC=javac
JAVA=java
JCFLAGS=
JRFLAGS=
TEX=xelatex
TEXFLAGS=--shell-escape --output-directory=tex

export openout_any=a

all:
	$(JAVAC) $(JCFLAGS) $(JFLAGS) PSE_2012_U_3_Sl_19_Grp_148.java
run:
	$(JAVAC) $(JCFLAGS) PSE_2012_U_3_Sl_19_Grp_148.java
	$(JAVA) $(JRFLAGS) PSE_2012_U_3_Sl_19_Grp_148
pdf:
	mint_project
	$(TEX) $(TEXFLAGS) ./tex/PSE_2012_U_3_Sl_19_Grp_148.tex
open-pdf:
	mint_project
	$(TEX) $(TEXFLAGS) ./tex/PSE_2012_U_3_Sl_19_Grp_148.tex && open ./tex/PSE_2012_U_3_Sl_19_Grp_148.pdf
doc:
	javadoc *.java -d ./doc
clean:
	rm PSE_2012_U_3_Sl_19_Grp_148.class
	rm PSE_2012_U_3_Sl_19_Grp_148.{aux,log,pdf}
