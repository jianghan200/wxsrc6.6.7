package com.tencent.mm.protocal.c;

public final class brh
  extends com.tencent.mm.bk.a
{
  public String dyJ;
  public int dyK;
  public String dyL;
  public String dyM;
  public String dyN;
  public String dyO;
  public String dyP;
  public String dyQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.dyJ != null) {
        paramVarArgs.g(1, this.dyJ);
      }
      paramVarArgs.fT(2, this.dyK);
      if (this.dyM != null) {
        paramVarArgs.g(3, this.dyM);
      }
      if (this.dyN != null) {
        paramVarArgs.g(4, this.dyN);
      }
      if (this.dyL != null) {
        paramVarArgs.g(5, this.dyL);
      }
      if (this.dyO != null) {
        paramVarArgs.g(6, this.dyO);
      }
      if (this.dyP != null) {
        paramVarArgs.g(7, this.dyP);
      }
      if (this.dyQ != null) {
        paramVarArgs.g(8, this.dyQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.dyJ == null) {
        break label552;
      }
    }
    label552:
    for (paramInt = f.a.a.b.b.a.h(1, this.dyJ) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.dyK);
      paramInt = i;
      if (this.dyM != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.dyM);
      }
      i = paramInt;
      if (this.dyN != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.dyN);
      }
      paramInt = i;
      if (this.dyL != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.dyL);
      }
      i = paramInt;
      if (this.dyO != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.dyO);
      }
      paramInt = i;
      if (this.dyP != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.dyP);
      }
      i = paramInt;
      if (this.dyQ != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.dyQ);
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
        brh localbrh = (brh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbrh.dyJ = locala.vHC.readString();
          return 0;
        case 2: 
          localbrh.dyK = locala.vHC.rY();
          return 0;
        case 3: 
          localbrh.dyM = locala.vHC.readString();
          return 0;
        case 4: 
          localbrh.dyN = locala.vHC.readString();
          return 0;
        case 5: 
          localbrh.dyL = locala.vHC.readString();
          return 0;
        case 6: 
          localbrh.dyO = locala.vHC.readString();
          return 0;
        case 7: 
          localbrh.dyP = locala.vHC.readString();
          return 0;
        }
        localbrh.dyQ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */