package com.tencent.mm.y;

public final class m
  extends com.tencent.mm.bk.a
{
  public String dzA;
  public int dzB;
  public int dzC;
  public String dzD;
  public String dzE;
  public int dzF;
  public int dzG;
  public String dzH;
  public String dzI;
  public String dzJ;
  public String dzK;
  public String dzL;
  public String dzM;
  public int dzN;
  public int dzO;
  public String dzw;
  public String dzx;
  public String dzy;
  public String dzz;
  public long time;
  public String title;
  public int type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.dzw != null) {
        paramVarArgs.g(3, this.dzw);
      }
      if (this.dzx != null) {
        paramVarArgs.g(4, this.dzx);
      }
      paramVarArgs.T(5, this.time);
      if (this.dzy != null) {
        paramVarArgs.g(6, this.dzy);
      }
      if (this.dzz != null) {
        paramVarArgs.g(7, this.dzz);
      }
      if (this.dzA != null) {
        paramVarArgs.g(8, this.dzA);
      }
      paramVarArgs.fT(9, this.type);
      paramVarArgs.fT(10, this.dzB);
      paramVarArgs.fT(11, this.dzC);
      if (this.dzD != null) {
        paramVarArgs.g(12, this.dzD);
      }
      if (this.dzE != null) {
        paramVarArgs.g(13, this.dzE);
      }
      paramVarArgs.fT(14, this.dzF);
      paramVarArgs.fT(15, this.dzG);
      if (this.dzH != null) {
        paramVarArgs.g(16, this.dzH);
      }
      if (this.dzI != null) {
        paramVarArgs.g(17, this.dzI);
      }
      if (this.dzJ != null) {
        paramVarArgs.g(18, this.dzJ);
      }
      if (this.dzK != null) {
        paramVarArgs.g(19, this.dzK);
      }
      if (this.dzL != null) {
        paramVarArgs.g(20, this.dzL);
      }
      if (this.dzM != null) {
        paramVarArgs.g(21, this.dzM);
      }
      paramVarArgs.fT(22, this.dzN);
      paramVarArgs.fT(23, this.dzO);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label1285;
      }
    }
    label1285:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.dzw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.dzw);
      }
      paramInt = i;
      if (this.dzx != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.dzx);
      }
      i = paramInt + f.a.a.a.S(5, this.time);
      paramInt = i;
      if (this.dzy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.dzy);
      }
      i = paramInt;
      if (this.dzz != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.dzz);
      }
      paramInt = i;
      if (this.dzA != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.dzA);
      }
      i = paramInt + f.a.a.a.fQ(9, this.type) + f.a.a.a.fQ(10, this.dzB) + f.a.a.a.fQ(11, this.dzC);
      paramInt = i;
      if (this.dzD != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.dzD);
      }
      i = paramInt;
      if (this.dzE != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.dzE);
      }
      i = i + f.a.a.a.fQ(14, this.dzF) + f.a.a.a.fQ(15, this.dzG);
      paramInt = i;
      if (this.dzH != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.dzH);
      }
      i = paramInt;
      if (this.dzI != null) {
        i = paramInt + f.a.a.b.b.a.h(17, this.dzI);
      }
      paramInt = i;
      if (this.dzJ != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.dzJ);
      }
      i = paramInt;
      if (this.dzK != null) {
        i = paramInt + f.a.a.b.b.a.h(19, this.dzK);
      }
      paramInt = i;
      if (this.dzL != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.dzL);
      }
      i = paramInt;
      if (this.dzM != null) {
        i = paramInt + f.a.a.b.b.a.h(21, this.dzM);
      }
      return i + f.a.a.a.fQ(22, this.dzN) + f.a.a.a.fQ(23, this.dzO);
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
        m localm = (m)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localm.title = locala.vHC.readString();
          return 0;
        case 2: 
          localm.url = locala.vHC.readString();
          return 0;
        case 3: 
          localm.dzw = locala.vHC.readString();
          return 0;
        case 4: 
          localm.dzx = locala.vHC.readString();
          return 0;
        case 5: 
          localm.time = locala.vHC.rZ();
          return 0;
        case 6: 
          localm.dzy = locala.vHC.readString();
          return 0;
        case 7: 
          localm.dzz = locala.vHC.readString();
          return 0;
        case 8: 
          localm.dzA = locala.vHC.readString();
          return 0;
        case 9: 
          localm.type = locala.vHC.rY();
          return 0;
        case 10: 
          localm.dzB = locala.vHC.rY();
          return 0;
        case 11: 
          localm.dzC = locala.vHC.rY();
          return 0;
        case 12: 
          localm.dzD = locala.vHC.readString();
          return 0;
        case 13: 
          localm.dzE = locala.vHC.readString();
          return 0;
        case 14: 
          localm.dzF = locala.vHC.rY();
          return 0;
        case 15: 
          localm.dzG = locala.vHC.rY();
          return 0;
        case 16: 
          localm.dzH = locala.vHC.readString();
          return 0;
        case 17: 
          localm.dzI = locala.vHC.readString();
          return 0;
        case 18: 
          localm.dzJ = locala.vHC.readString();
          return 0;
        case 19: 
          localm.dzK = locala.vHC.readString();
          return 0;
        case 20: 
          localm.dzL = locala.vHC.readString();
          return 0;
        case 21: 
          localm.dzM = locala.vHC.readString();
          return 0;
        case 22: 
          localm.dzN = locala.vHC.rY();
          return 0;
        }
        localm.dzO = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/y/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */