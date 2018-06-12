package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class kb
  extends com.tencent.mm.bk.a
{
  public long rlK;
  public String rlL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rlL == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      paramVarArgs.T(1, this.rlK);
      if (this.rlL != null) {
        paramVarArgs.g(2, this.rlL);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.S(1, this.rlK) + 0;
      paramInt = i;
    } while (this.rlL == null);
    return i + f.a.a.b.b.a.h(2, this.rlL);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rlL == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      kb localkb = (kb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localkb.rlK = locala.vHC.rZ();
        return 0;
      }
      localkb.rlL = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */