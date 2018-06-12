package com.tencent.mm.protocal.c;

public final class aum
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jSt;
  public String mEl;
  public String rXG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jSt != null) {
        paramVarArgs.g(1, this.jSt);
      }
      if (this.rXG != null) {
        paramVarArgs.g(2, this.rXG);
      }
      if (this.mEl != null) {
        paramVarArgs.g(3, this.mEl);
      }
      paramVarArgs.fT(4, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jSt == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.jSt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rXG != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rXG);
      }
      i = paramInt;
      if (this.mEl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mEl);
      }
      return i + f.a.a.a.fQ(4, this.hcE);
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
        aum localaum = (aum)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaum.jSt = locala.vHC.readString();
          return 0;
        case 2: 
          localaum.rXG = locala.vHC.readString();
          return 0;
        case 3: 
          localaum.mEl = locala.vHC.readString();
          return 0;
        }
        localaum.hcE = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */