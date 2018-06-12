package com.tencent.mm.protocal.c;

public final class hs
  extends com.tencent.mm.bk.a
{
  public String name;
  public String riE;
  public String riF;
  public int riG;
  public int riH;
  public String riI;
  public String riJ;
  public int type;
  public int ver;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riE != null) {
        paramVarArgs.g(1, this.riE);
      }
      paramVarArgs.fT(2, this.type);
      if (this.riF != null) {
        paramVarArgs.g(3, this.riF);
      }
      if (this.name != null) {
        paramVarArgs.g(4, this.name);
      }
      paramVarArgs.fT(5, this.ver);
      paramVarArgs.fT(6, this.riG);
      paramVarArgs.fT(7, this.riH);
      if (this.riI != null) {
        paramVarArgs.g(8, this.riI);
      }
      if (this.riJ != null) {
        paramVarArgs.g(9, this.riJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.riE == null) {
        break label559;
      }
    }
    label559:
    for (paramInt = f.a.a.b.b.a.h(1, this.riE) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.type);
      paramInt = i;
      if (this.riF != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.riF);
      }
      i = paramInt;
      if (this.name != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.name);
      }
      i = i + f.a.a.a.fQ(5, this.ver) + f.a.a.a.fQ(6, this.riG) + f.a.a.a.fQ(7, this.riH);
      paramInt = i;
      if (this.riI != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.riI);
      }
      i = paramInt;
      if (this.riJ != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.riJ);
      }
      return i;
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
        hs localhs = (hs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localhs.riE = locala.vHC.readString();
          return 0;
        case 2: 
          localhs.type = locala.vHC.rY();
          return 0;
        case 3: 
          localhs.riF = locala.vHC.readString();
          return 0;
        case 4: 
          localhs.name = locala.vHC.readString();
          return 0;
        case 5: 
          localhs.ver = locala.vHC.rY();
          return 0;
        case 6: 
          localhs.riG = locala.vHC.rY();
          return 0;
        case 7: 
          localhs.riH = locala.vHC.rY();
          return 0;
        case 8: 
          localhs.riI = locala.vHC.readString();
          return 0;
        }
        localhs.riJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */