/**
 * generated by Xtext 2.25.0
 */
package l3IAProjectHTML.generator;

import com.google.common.base.Objects;
import fRUnivCoteAzurL3IAProjectHTML.EnumComparaison;
import fRUnivCoteAzurL3IAProjectHTML.FileLoader;
import fRUnivCoteAzurL3IAProjectHTML.Filter;
import fRUnivCoteAzurL3IAProjectHTML.Graph;
import fRUnivCoteAzurL3IAProjectHTML.Program;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    Program prog = ((Program) _head);
    ArrayList<Object> columns = new ArrayList<Object>();
    ArrayList<Object> colCompa = new ArrayList<Object>();
    final ArrayList<Object> selectData = new ArrayList<Object>();
    ArrayList<Object> graphique = new ArrayList<Object>();
    ArrayList<Object> columnAbs = new ArrayList<Object>();
    ArrayList<String> columnOther = new ArrayList<String>();
    ArrayList<String> nameColumnOther = new ArrayList<String>();
    EList<Filter> _filter = prog.getFilter();
    for (final Filter filter : _filter) {
      this.filterToString(filter, columns, colCompa, columnAbs, columnOther);
    }
    EList<Graph> _graph = prog.getGraph();
    for (final Graph graph : _graph) {
      this.graphToString(graph, graphique);
    }
    EList<FileLoader> _fileloader = prog.getFileloader();
    for (final FileLoader file : _fileloader) {
      this.fileToString(file, columns, selectData, colCompa);
    }
    int x = 0;
    while ((x != columnOther.size())) {
      {
        String _get = columnOther.get(x);
        String _plus = ("\'" + _get);
        String _plus_1 = (_plus + "\'");
        nameColumnOther.add(_plus_1);
        x++;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<title>");
    Object _get = graphique.get(1);
    _builder.append(_get, "\t\t\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<canvas id=\"myChart\" style=\"display: block; box-sizing: border-box; height: 376px; width: 752px;\" width=\"940\" height=\"470\"></canvas>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("const CHART_COLORS = {");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("redt: \'rgba(255, 99, 132, 0.6)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("red: \'rgb(255, 99, 132)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("orange: \'rgb(255, 159, 64)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("yellow: \'rgb(255, 205, 86)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("green: \'rgb(75, 192, 192)\',");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.append("bluet: \'rgba(54, 162, 235,0.6)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("blue: \'rgb(54, 162, 235)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("purple: \'rgb(153, 102, 255)\',");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("grey: \'rgb(201, 203, 207)\'");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const NAMED_COLORS = [");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("CHART_COLORS.red,");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("CHART_COLORS.orange,");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("CHART_COLORS.yellow,");
    _builder.newLine();
    _builder.append("\t  \t    ");
    _builder.append("CHART_COLORS.green,");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("CHART_COLORS.blue,");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("CHART_COLORS.purple,");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("CHART_COLORS.grey,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const data = ");
    _builder.append(selectData, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("let Datasets =[];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("let otherCols = ");
    _builder.append(nameColumnOther, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (let i =0; i <otherCols.length;i++){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("let columnName = otherCols[i];");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("let newDataset = {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("label: columnName,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("data: data.map(row => row[columnName]),");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Datasets.push(newDataset);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  \t\t\t\t\t");
    _builder.append("new Chart(");
    _builder.newLine();
    _builder.append("\t    \t\t\t\t\t");
    _builder.append("document.getElementById(\'myChart\'),");
    _builder.newLine();
    _builder.append("\t    \t\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t      \t\t\t\t\t");
    _builder.append("type: \'");
    Object _get_1 = graphique.get(0);
    _builder.append(_get_1, "\t      \t\t\t\t\t");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t      \t\t\t\t\t");
    _builder.append("data: {");
    _builder.newLine();
    _builder.append("\t        \t\t\t\t\t");
    _builder.append("labels: data.map(row => row.");
    Object _get_2 = columnAbs.get(0);
    _builder.append(_get_2, "\t        \t\t\t\t\t");
    _builder.append("),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        \t\t\t\t\t");
    _builder.append("datasets: Datasets");
    _builder.newLine();
    _builder.append("\t      \t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    \t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  \t\t\t\t");
    _builder.append(");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    fsa.generateFile("myGeneratedFile.html", _builder);
  }
  
  /**
   * Fonction qui permet de trouver l'index d'une colonne
   * @param data La liste des donn�es
   * @param column la colonne ou l'on veut trouver l'index
   * @return le numero de l'index
   */
  public int getIndex(final List<List<String>> data, final String column) {
    int index = (-1);
    int _size = data.get(0).size();
    int _minus = (_size - 1);
    IntegerRange _upTo = new IntegerRange(0, _minus);
    for (final Integer i : _upTo) {
      boolean _equals = data.get(0).get((i).intValue()).equals(column);
      if (_equals) {
        index = (i).intValue();
      }
    }
    return index;
  }
  
  public String selectData(final String fileName, final ArrayList columns, final ArrayList selectedData, final ArrayList colCompa) {
    try {
      ArrayList<String> namesCol = new ArrayList<String>();
      ArrayList<Integer> indexCol = new ArrayList<Integer>();
      ArrayList<String> typeCol = new ArrayList<String>();
      final ArrayList<List<String>> data = new ArrayList<List<String>>();
      FileReader _fileReader = new FileReader(fileName);
      final BufferedReader reader = new BufferedReader(_fileReader);
      String line = "";
      String firstLine = "";
      int expetedNumberOfColummns = (-1);
      int x = 0;
      while ((!Objects.equal((line = reader.readLine()), null))) {
        {
          if ((x == 0)) {
            firstLine = line;
            expetedNumberOfColummns = ((List<String>)Conversions.doWrapArray(firstLine.split(";"))).size();
            x++;
          }
          final String[] values = line.split(";");
          int _size = ((List<String>)Conversions.doWrapArray(values)).size();
          boolean _equals = (_size == expetedNumberOfColummns);
          if (_equals) {
            data.add(Arrays.<String>asList(values));
          }
        }
      }
      int i = 0;
      while ((i != columns.size())) {
        {
          namesCol.add(columns.get(i).toString());
          i++;
        }
      }
      i = 0;
      while ((i != namesCol.size())) {
        {
          indexCol.add(Integer.valueOf(this.getIndex(data, namesCol.get(i))));
          i++;
        }
      }
      i = 0;
      while ((i != indexCol.size())) {
        {
          typeCol.add(data.get(1).get((indexCol.get(i)).intValue()));
          i++;
        }
      }
      String json = "[";
      ArrayList<String> nameColCompa = new ArrayList<String>();
      ArrayList<String> comparator = new ArrayList<String>();
      ArrayList<Object> valueCompared = new ArrayList<Object>();
      i = 0;
      boolean _isEmpty = colCompa.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        while ((i != colCompa.size())) {
          {
            final String maChaine = colCompa.get(i).toString();
            final String[] parties = maChaine.split(" ");
            nameColCompa.add(parties[0]);
            comparator.add(parties[1]);
            valueCompared.add(parties[2]);
            i++;
          }
        }
      }
      int _size = data.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(2, _minus);
      for (final Integer row : _upTo) {
        {
          String rowData = "{";
          String filter = "";
          boolean _isEmpty_1 = colCompa.isEmpty();
          boolean _equals_1 = (_isEmpty_1 == false);
          if (_equals_1) {
            int valueCpt = 0;
            filter = data.get((row).intValue()).get(this.getIndex(data, nameColCompa.get(0)));
            Object _get = valueCompared.get(0);
            boolean _equals_2 = Objects.equal(filter, _get);
            if (_equals_2) {
              int _size_1 = namesCol.size();
              int _minus_1 = (_size_1 - 1);
              IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
              for (final Integer column : _upTo_1) {
                {
                  String value = data.get((row).intValue()).get((indexCol.get((column).intValue())).intValue());
                  if (((!Objects.equal(value, null)) && (!value.trim().isEmpty()))) {
                    String _lowerCase = typeCol.get((column).intValue()).toLowerCase();
                    boolean _equals_3 = Objects.equal(_lowerCase, "string");
                    if (_equals_3) {
                      String _string = value.toString();
                      String _plus = ("\"" + _string);
                      String _plus_1 = (_plus + "\"");
                      value = _plus_1;
                    }
                    String _rowData = rowData;
                    String _get_1 = namesCol.get((column).intValue());
                    String _plus_2 = (_get_1 + ":");
                    String _plus_3 = (_plus_2 + value);
                    rowData = (_rowData + _plus_3);
                    int _size_2 = namesCol.size();
                    int _minus_2 = (_size_2 - 1);
                    boolean _notEquals = ((column).intValue() != _minus_2);
                    if (_notEquals) {
                      String _rowData_1 = rowData;
                      rowData = (_rowData_1 + ",");
                    }
                    valueCpt++;
                  }
                }
              }
              if (((!rowData.isEmpty()) && (valueCpt == namesCol.size()))) {
                String _rowData = rowData;
                rowData = (_rowData + "}");
                selectedData.add(rowData);
              }
            }
          } else {
            int valueCpt_1 = 0;
            int _size_2 = namesCol.size();
            int _minus_2 = (_size_2 - 1);
            IntegerRange _upTo_2 = new IntegerRange(0, _minus_2);
            for (final Integer column_1 : _upTo_2) {
              {
                String value = data.get((row).intValue()).get((indexCol.get((column_1).intValue())).intValue());
                if (((!Objects.equal(value, null)) && (!value.trim().isEmpty()))) {
                  String _lowerCase = typeCol.get((column_1).intValue()).toLowerCase();
                  boolean _equals_3 = Objects.equal(_lowerCase, "string");
                  if (_equals_3) {
                    String _string = value.toString();
                    String _plus = ("\"" + _string);
                    String _plus_1 = (_plus + "\"");
                    value = _plus_1;
                  }
                  String _rowData_1 = rowData;
                  String _get_1 = namesCol.get((column_1).intValue());
                  String _plus_2 = (_get_1 + ":");
                  String _plus_3 = (_plus_2 + value);
                  rowData = (_rowData_1 + _plus_3);
                  int _size_3 = namesCol.size();
                  int _minus_3 = (_size_3 - 1);
                  boolean _notEquals = ((column_1).intValue() != _minus_3);
                  if (_notEquals) {
                    String _rowData_2 = rowData;
                    rowData = (_rowData_2 + ",");
                  }
                  valueCpt_1++;
                }
              }
            }
            if (((!rowData.isEmpty()) && (valueCpt_1 == namesCol.size()))) {
              String _rowData_1 = rowData;
              rowData = (_rowData_1 + "}");
              selectedData.add(rowData);
            }
          }
        }
      }
      String _json = json;
      String _join = IterableExtensions.join(selectedData, ",");
      json = (_json + _join);
      String _json_1 = json;
      json = (_json_1 + "]");
      return selectedData.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ArrayList filterToString(final Filter fi, final ArrayList columns, final ArrayList columnCompa, final ArrayList columnAbs, final ArrayList columnOther) {
    String compa = "";
    EnumComparaison comparaison = fi.getComparaison();
    Boolean abs = fi.getAbs();
    String elemCompa = fi.getElementComparaison();
    String nameCol = fi.getName();
    boolean _notEquals = (!Objects.equal(abs, null));
    if (_notEquals) {
      columnAbs.add(nameCol);
    } else {
      String _string = fi.getComparaison().toString();
      boolean _equals = Objects.equal(_string, "none");
      if (_equals) {
        columnOther.add(nameCol);
      }
    }
    String _string_1 = fi.getComparaison().toString();
    boolean _notEquals_1 = (!Objects.equal(_string_1, "none"));
    if (_notEquals_1) {
      String _string_2 = comparaison.toString();
      boolean _equals_1 = Objects.equal(_string_2, "equal");
      if (_equals_1) {
        compa = "=";
      } else {
        String _string_3 = comparaison.toString();
        boolean _equals_2 = Objects.equal(_string_3, "inf");
        if (_equals_2) {
          compa = "<";
        } else {
          String _string_4 = comparaison.toString();
          boolean _equals_3 = Objects.equal(_string_4, "sup");
          if (_equals_3) {
            compa = ">";
          }
        }
      }
      String _string_5 = nameCol.toString();
      String _plus = (_string_5 + " ");
      String _plus_1 = (_plus + compa);
      String _plus_2 = (_plus_1 + " ");
      String _plus_3 = (_plus_2 + elemCompa);
      columnCompa.add(_plus_3);
    } else {
      columns.add(nameCol);
    }
    return columns;
  }
  
  public String fileToString(final FileLoader file, final ArrayList columns, final ArrayList selectData, final ArrayList ColumnsCop) {
    String res = "";
    String path = file.getPath();
    res = this.selectData(path, columns, selectData, ColumnsCop);
    return res;
  }
  
  public ArrayList graphToString(final Graph graph, final ArrayList graphique) {
    graphique.add(graph.getType());
    graphique.add(graph.getName());
    return graphique;
  }
}