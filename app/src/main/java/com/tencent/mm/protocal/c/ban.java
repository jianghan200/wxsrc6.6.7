package com.tencent.mm.protocal.c;

public final class ban
  extends com.tencent.mm.bk.a
{
  public String jSv;
  public String lOE;
  public String lOG;
  public int lOH;
  public String lOI;
  public int lOJ;
  public String lOK;
  public int lOL;
  public int lOM;
  public String lOO;
  public String lOP;
  public String lOQ;
  public String lOR;
  public int scI;
  public String scU;
  public String scV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lOE != null) {
        paramVarArgs.g(1, this.lOE);
      }
      paramVarArgs.fT(2, this.scI);
      if (this.lOG != null) {
        paramVarArgs.g(3, this.lOG);
      }
      paramVarArgs.fT(4, this.lOH);
      if (this.lOI != null) {
        paramVarArgs.g(5, this.lOI);
      }
      paramVarArgs.fT(6, this.lOJ);
      if (this.lOK != null) {
        paramVarArgs.g(7, this.lOK);
      }
      paramVarArgs.fT(8, this.lOL);
      paramVarArgs.fT(9, this.lOM);
      if (this.jSv != null) {
        paramVarArgs.g(11, this.jSv);
      }
      if (this.lOO != null) {
        paramVarArgs.g(12, this.lOO);
      }
      if (this.lOP != null) {
        paramVarArgs.g(13, this.lOP);
      }
      if (this.lOQ != null) {
        paramVarArgs.g(14, this.lOQ);
      }
      if (this.lOR != null) {
        paramVarArgs.g(15, this.lOR);
      }
      if (this.scU != null) {
        paramVarArgs.g(18, this.scU);
      }
      if (this.scV != null) {
        paramVarArgs.g(19, this.scV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lOE == null) {
        break label956;
      }
    }
    label956:
    for (paramInt = f.a.a.b.b.a.h(1, this.lOE) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.scI);
      paramInt = i;
      if (this.lOG != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.lOG);
      }
      i = paramInt + f.a.a.a.fQ(4, this.lOH);
      paramInt = i;
      if (this.lOI != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.lOI);
      }
      i = paramInt + f.a.a.a.fQ(6, this.lOJ);
      paramInt = i;
      if (this.lOK != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.lOK);
      }
      i = paramInt + f.a.a.a.fQ(8, this.lOL) + f.a.a.a.fQ(9, this.lOM);
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.jSv);
      }
      i = paramInt;
      if (this.lOO != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.lOO);
      }
      paramInt = i;
      if (this.lOP != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.lOP);
      }
      i = paramInt;
      if (this.lOQ != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.lOQ);
      }
      paramInt = i;
      if (this.lOR != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.lOR);
      }
      i = paramInt;
      if (this.scU != null) {
        i = paramInt + f.a.a.b.b.a.h(18, this.scU);
      }
      paramInt = i;
      if (this.scV != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.scV);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ban localban = (ban)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 10: 
        case 16: 
        case 17: 
        default: 
          return -1;
        case 1: 
          localban.lOE = locala.vHC.readString();
          return 0;
        case 2: 
          localban.scI = locala.vHC.rY();
          return 0;
        case 3: 
          localban.lOG = locala.vHC.readString();
          return 0;
        case 4: 
          localban.lOH = locala.vHC.rY();
          return 0;
        case 5: 
          localban.lOI = locala.vHC.readString();
          return 0;
        case 6: 
          localban.lOJ = locala.vHC.rY();
          return 0;
        case 7: 
          localban.lOK = locala.vHC.readString();
          return 0;
        case 8: 
          localban.lOL = locala.vHC.rY();
          return 0;
        case 9: 
          localban.lOM = locala.vHC.rY();
          return 0;
        case 11: 
          localban.jSv = locala.vHC.readString();
          return 0;
        case 12: 
          localban.lOO = locala.vHC.readString();
          return 0;
        case 13: 
          localban.lOP = locala.vHC.readString();
          return 0;
        case 14: 
          localban.lOQ = locala.vHC.readString();
          return 0;
        case 15: 
          localban.lOR = locala.vHC.readString();
          return 0;
        case 18: 
          localban.scU = locala.vHC.readString();
          return 0;
        }
        localban.scV = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ban.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */