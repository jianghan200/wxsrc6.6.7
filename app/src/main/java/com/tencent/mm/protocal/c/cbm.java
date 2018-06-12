package com.tencent.mm.protocal.c;

public final class cbm
  extends com.tencent.mm.bk.a
{
  public String bGB;
  public String bGC;
  public String sxC;
  public long timestamp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bGB != null) {
        paramVarArgs.g(1, this.bGB);
      }
      if (this.bGC != null) {
        paramVarArgs.g(2, this.bGC);
      }
      if (this.sxC != null) {
        paramVarArgs.g(3, this.sxC);
      }
      paramVarArgs.T(4, this.timestamp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bGB == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.bGB) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bGC != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bGC);
      }
      i = paramInt;
      if (this.sxC != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sxC);
      }
      return i + f.a.a.a.S(4, this.timestamp);
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
        cbm localcbm = (cbm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcbm.bGB = locala.vHC.readString();
          return 0;
        case 2: 
          localcbm.bGC = locala.vHC.readString();
          return 0;
        case 3: 
          localcbm.sxC = locala.vHC.readString();
          return 0;
        }
        localcbm.timestamp = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */