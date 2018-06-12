package com.tencent.mm.plugin.report.service;

import f.a.a.b;

public final class c
  extends com.tencent.mm.bk.a
{
  public boolean mEd;
  public int mEk;
  public String mEl;
  public boolean mEm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.mEl == null) {
        throw new b("Not all required fields were included: Value");
      }
      paramVarArgs.fT(1, this.mEk);
      if (this.mEl != null) {
        paramVarArgs.g(2, this.mEl);
      }
      paramVarArgs.av(3, this.mEm);
      paramVarArgs.av(4, this.mEd);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.mEk) + 0;
      paramInt = i;
      if (this.mEl != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.mEl);
      }
      return paramInt + (f.a.a.b.b.a.ec(3) + 1) + (f.a.a.b.b.a.ec(4) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.mEl == null) {
        throw new b("Not all required fields were included: Value");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localc.mEk = locala.vHC.rY();
        return 0;
      case 2: 
        localc.mEl = locala.vHC.readString();
        return 0;
      case 3: 
        localc.mEm = locala.cJQ();
        return 0;
      }
      localc.mEd = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */