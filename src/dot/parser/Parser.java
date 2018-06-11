/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.parser;

import dot.lexer.*;
import dot.node.*;
import dot.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList nodeList;

    private final Lexer lexer;
    private final ListIterator stack = new LinkedList().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    @SuppressWarnings({"unchecked","unused"})
    private void push(int numstate, ArrayList listNode) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList list = new ArrayList();
		        list.add(this.lexer.next());
                        push(this.action[1], list);
                    }
		    break;
                case REDUCE:
                    switch(this.action[1])
                    {
                    case 0: /* reduce AAgraph1Graph */
		    {
			ArrayList list = new0();
			push(goTo(0), list);
		    }
		    break;
                    case 1: /* reduce AAgraph2Graph */
		    {
			ArrayList list = new1();
			push(goTo(0), list);
		    }
		    break;
                    case 2: /* reduce AAedgestmt1EdgeStmt */
		    {
			ArrayList list = new2();
			push(goTo(1), list);
		    }
		    break;
                    case 3: /* reduce AAedgestmt2EdgeStmt */
		    {
			ArrayList list = new3();
			push(goTo(1), list);
		    }
		    break;
                    case 4: /* reduce AAnodestmt1NodeStmt */
		    {
			ArrayList list = new4();
			push(goTo(2), list);
		    }
		    break;
                    case 5: /* reduce AAnodestmt2NodeStmt */
		    {
			ArrayList list = new5();
			push(goTo(2), list);
		    }
		    break;
                    case 6: /* reduce ADGraphType */
		    {
			ArrayList list = new6();
			push(goTo(3), list);
		    }
		    break;
                    case 7: /* reduce AUGraphType */
		    {
			ArrayList list = new7();
			push(goTo(3), list);
		    }
		    break;
                    case 8: /* reduce AId */
		    {
			ArrayList list = new8();
			push(goTo(4), list);
		    }
		    break;
                    case 9: /* reduce AAstatementlist1StatementList */
		    {
			ArrayList list = new9();
			push(goTo(5), list);
		    }
		    break;
                    case 10: /* reduce AAstatementlist2StatementList */
		    {
			ArrayList list = new10();
			push(goTo(5), list);
		    }
		    break;
                    case 11: /* reduce ADEdgeop */
		    {
			ArrayList list = new11();
			push(goTo(6), list);
		    }
		    break;
                    case 12: /* reduce AUEdgeop */
		    {
			ArrayList list = new12();
			push(goTo(6), list);
		    }
		    break;
                    case 13: /* reduce ANodeStatement */
		    {
			ArrayList list = new13();
			push(goTo(7), list);
		    }
		    break;
                    case 14: /* reduce AEdgeStatement */
		    {
			ArrayList list = new14();
			push(goTo(7), list);
		    }
		    break;
                    case 15: /* reduce AAttrStatement */
		    {
			ArrayList list = new15();
			push(goTo(7), list);
		    }
		    break;
                    case 16: /* reduce AAattributelist1AttributeList */
		    {
			ArrayList list = new16();
			push(goTo(8), list);
		    }
		    break;
                    case 17: /* reduce AAattributelist2AttributeList */
		    {
			ArrayList list = new17();
			push(goTo(8), list);
		    }
		    break;
                    case 18: /* reduce AAssignmentList */
		    {
			ArrayList list = new18();
			push(goTo(9), list);
		    }
		    break;
                    case 19: /* reduce AListAssignmentList */
		    {
			ArrayList list = new19();
			push(goTo(9), list);
		    }
		    break;
                    case 20: /* reduce AAssignment */
		    {
			ArrayList list = new20();
			push(goTo(10), list);
		    }
		    break;
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PCreateGraph node1 = (PCreateGraph) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }



    @SuppressWarnings("unchecked")
    ArrayList new0() /* reduce AAgraph1Graph */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCreateGraph pcreategraphNode1;
        {
            // Block
        TId tidNode2;
        tidNode2 = (TId)nodeArrayList2.get(0);

        pcreategraphNode1 = new ACreateGraph(tidNode2);
        }
	nodeList.add(pcreategraphNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new1() /* reduce AAgraph2Graph */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList6 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCreateGraph pcreategraphNode1;
        {
            // Block
        TId tidNode2;
        tidNode2 = (TId)nodeArrayList3.get(0);

        pcreategraphNode1 = new ACreateGraph(tidNode2);
        }
	nodeList.add(pcreategraphNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new2() /* reduce AAedgestmt1EdgeStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCreatePcNodes pcreatepcnodesNode1;
        {
            // Block
        TId tidNode2;
        TId tidNode3;
        tidNode2 = (TId)nodeArrayList1.get(0);
        tidNode3 = (TId)nodeArrayList3.get(0);

        pcreatepcnodesNode1 = new ACreatePcNodes(tidNode2, tidNode3);
        }
	nodeList.add(pcreatepcnodesNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new3() /* reduce AAedgestmt2EdgeStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCreatePcNodes pcreatepcnodesNode1;
        {
            // Block
        TId tidNode2;
        TId tidNode3;
        tidNode2 = (TId)nodeArrayList1.get(0);
        tidNode3 = (TId)nodeArrayList3.get(0);

        pcreatepcnodesNode1 = new ACreatePcNodes(tidNode2, tidNode3);
        }
	nodeList.add(pcreatepcnodesNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new4() /* reduce AAnodestmt1NodeStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCreateNode pcreatenodeNode1;
        {
            // Block
        TId tidNode2;
        tidNode2 = (TId)nodeArrayList1.get(0);

        pcreatenodeNode1 = new ACreateNode(tidNode2);
        }
	nodeList.add(pcreatenodeNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new5() /* reduce AAnodestmt2NodeStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCreateNode pcreatenodeNode1;
        {
            // Block
        TId tidNode2;
        tidNode2 = (TId)nodeArrayList1.get(0);

        pcreatenodeNode1 = new ACreateNode(tidNode2);
        }
	nodeList.add(pcreatenodeNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new6() /* reduce ADGraphType */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new7() /* reduce AUGraphType */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new8() /* reduce AId */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new9() /* reduce AAstatementlist1StatementList */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new10() /* reduce AAstatementlist2StatementList */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new11() /* reduce ADEdgeop */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new12() /* reduce AUEdgeop */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new13() /* reduce ANodeStatement */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new14() /* reduce AEdgeStatement */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new15() /* reduce AAttrStatement */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new16() /* reduce AAattributelist1AttributeList */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new17() /* reduce AAattributelist2AttributeList */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new18() /* reduce AAssignmentList */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new19() /* reduce AListAssignmentList */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new20() /* reduce AAssignment */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {8, SHIFT, 1}, {9, SHIFT, 2}, {10, SHIFT, 3}, },
			{{-1, ERROR, 1}, {9, SHIFT, 2}, {10, SHIFT, 3}, },
			{{-1, REDUCE, 6}, },
			{{-1, REDUCE, 7}, },
			{{-1, ERROR, 4}, {14, ACCEPT, -1}, },
			{{-1, ERROR, 5}, {12, SHIFT, 7}, },
			{{-1, ERROR, 6}, {12, SHIFT, 8}, },
			{{-1, ERROR, 7}, {2, SHIFT, 9}, },
			{{-1, ERROR, 8}, {2, SHIFT, 10}, },
			{{-1, ERROR, 9}, {12, SHIFT, 11}, {13, SHIFT, 12}, },
			{{-1, ERROR, 10}, {12, SHIFT, 11}, {13, SHIFT, 12}, },
			{{-1, REDUCE, 4}, {4, SHIFT, 18}, {6, SHIFT, 19}, {7, SHIFT, 20}, },
			{{-1, ERROR, 12}, {4, SHIFT, 18}, },
			{{-1, REDUCE, 14}, },
			{{-1, REDUCE, 13}, },
			{{-1, ERROR, 15}, {3, SHIFT, 24}, },
			{{-1, REDUCE, 9}, {12, SHIFT, 11}, {13, SHIFT, 12}, },
			{{-1, ERROR, 17}, {3, SHIFT, 26}, },
			{{-1, ERROR, 18}, {5, SHIFT, 27}, {12, SHIFT, 28}, },
			{{-1, REDUCE, 11}, },
			{{-1, REDUCE, 12}, },
			{{-1, ERROR, 21}, {12, SHIFT, 32}, },
			{{-1, REDUCE, 5}, },
			{{-1, REDUCE, 15}, },
			{{-1, REDUCE, 0}, },
			{{-1, REDUCE, 10}, },
			{{-1, REDUCE, 1}, },
			{{-1, REDUCE, 16}, },
			{{-1, REDUCE, 8}, },
			{{-1, ERROR, 29}, {0, SHIFT, 33}, },
			{{-1, ERROR, 30}, {5, SHIFT, 34}, },
			{{-1, REDUCE, 18}, {1, SHIFT, 35}, },
			{{-1, REDUCE, 2}, {4, SHIFT, 18}, },
			{{-1, ERROR, 33}, {12, SHIFT, 28}, },
			{{-1, REDUCE, 17}, },
			{{-1, ERROR, 35}, {12, SHIFT, 28}, },
			{{-1, REDUCE, 3}, },
			{{-1, REDUCE, 20}, },
			{{-1, REDUCE, 19}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 4}, },
			{{-1, 13}, },
			{{-1, 14}, },
			{{-1, 5}, {1, 6}, },
			{{-1, 29}, {33, 37}, },
			{{-1, 15}, {10, 17}, {16, 25}, },
			{{-1, 21}, },
			{{-1, 16}, },
			{{-1, 22}, {12, 23}, {32, 36}, },
			{{-1, 30}, {35, 38}, },
			{{-1, 31}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: 'strict', 'digraph', 'graph'",
			"expecting: 'digraph', 'graph'",
			"expecting: id",
			"expecting: EOF",
			"expecting: '{'",
			"expecting: id, type",
			"expecting: '}', '[', '->', '--', id, type",
			"expecting: '['",
			"expecting: '}', id, type",
			"expecting: '}'",
			"expecting: ']', id",
			"expecting: '=', ',', ']'",
			"expecting: '='",
			"expecting: ']'",
			"expecting: ',', ']'",
			"expecting: '}', '[', id, type",
        };*/
    private static int[] errors;
/*      {
			0, 1, 2, 2, 3, 2, 2, 4, 4, 5, 5, 6, 7, 8, 8, 9, 8, 9, 10, 2, 2, 2, 8, 8, 3, 9, 3, 8, 11, 12, 13, 14, 15, 2, 8, 2, 8, 14, 13, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}