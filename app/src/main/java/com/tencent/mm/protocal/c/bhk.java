package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bhk
  extends com.tencent.mm.bk.a
{
  public int sip;
  public String siq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.siq == null) {
        throw new b("Not all required fields were included: ResKey");
      }
      paramVarArgs.fT(1, this.sip);
      if (this.siq != null) {
        paramVarArgs.g(2, this.siq);
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
      i = f.a.a.a.fQ(1, this.sip) + 0;
      paramInt = i;
    } while (this.siq == null);
    return i + f.a.a.b.b.a.h(2, this.siq);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.siq == null) {
        throw new b("Not all required fields were included: ResKey");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bhk localbhk = (bhk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbhk.sip = locala.vHC.rY();
        return 0;
      }
      localbhk.siq = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */