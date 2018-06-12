package com.tencent.mm.protocal.c;

public final class byb
  extends com.tencent.mm.bk.a
{
  public String mEl;
  public String rEJ;
  public String siA;
  public String sud;
  public int sue;
  public String suf;
  public String sug;
  public int suh;
  public String sui;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.mEl != null) {
        paramVarArgs.g(1, this.mEl);
      }
      if (this.sud != null) {
        paramVarArgs.g(2, this.sud);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(3, this.rEJ);
      }
      paramVarArgs.fT(4, this.sue);
      if (this.siA != null) {
        paramVarArgs.g(5, this.siA);
      }
      if (this.suf != null) {
        paramVarArgs.g(6, this.suf);
      }
      if (this.sug != null) {
        paramVarArgs.g(7, this.sug);
      }
      paramVarArgs.fT(8, this.suh);
      if (this.sui != null) {
        paramVarArgs.g(9, this.sui);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.mEl == null) {
        break label595;
      }
    }
    label595:
    for (int i = f.a.a.b.b.a.h(1, this.mEl) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sud != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sud);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rEJ);
      }
      i += f.a.a.a.fQ(4, this.sue);
      paramInt = i;
      if (this.siA != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.siA);
      }
      i = paramInt;
      if (this.suf != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.suf);
      }
      paramInt = i;
      if (this.sug != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sug);
      }
      i = paramInt + f.a.a.a.fQ(8, this.suh);
      paramInt = i;
      if (this.sui != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.sui);
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
        byb localbyb = (byb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbyb.mEl = locala.vHC.readString();
          return 0;
        case 2: 
          localbyb.sud = locala.vHC.readString();
          return 0;
        case 3: 
          localbyb.rEJ = locala.vHC.readString();
          return 0;
        case 4: 
          localbyb.sue = locala.vHC.rY();
          return 0;
        case 5: 
          localbyb.siA = locala.vHC.readString();
          return 0;
        case 6: 
          localbyb.suf = locala.vHC.readString();
          return 0;
        case 7: 
          localbyb.sug = locala.vHC.readString();
          return 0;
        case 8: 
          localbyb.suh = locala.vHC.rY();
          return 0;
        }
        localbyb.sui = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/byb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */