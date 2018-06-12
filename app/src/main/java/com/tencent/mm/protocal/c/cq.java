package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cq
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public int type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bSc == null) {
        throw new b("Not all required fields were included: wording");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      paramVarArgs.fT(1, this.type);
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.type) + 0;
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = paramInt;
    } while (this.url == null);
    return paramInt + f.a.a.b.b.a.h(3, this.url);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.bSc == null) {
        throw new b("Not all required fields were included: wording");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cq localcq = (cq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcq.type = locala.vHC.rY();
        return 0;
      case 2: 
        localcq.bSc = locala.vHC.readString();
        return 0;
      }
      localcq.url = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */