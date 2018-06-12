package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class jv
  extends com.tencent.mm.bk.a
{
  public String jPG;
  public String rlp;
  public String rlq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPG == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.jPG != null) {
        paramVarArgs.g(1, this.jPG);
      }
      if (this.rlp != null) {
        paramVarArgs.g(2, this.rlp);
      }
      if (this.rlq != null) {
        paramVarArgs.g(3, this.rlq);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPG == null) {
        break label321;
      }
    }
    label321:
    for (int i = f.a.a.b.b.a.h(1, this.jPG) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rlp != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rlp);
      }
      i = paramInt;
      if (this.rlq != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rlq);
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
        if (this.jPG != null) {
          break;
        }
        throw new b("Not all required fields were included: IconUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        jv localjv = (jv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localjv.jPG = locala.vHC.readString();
          return 0;
        case 2: 
          localjv.rlp = locala.vHC.readString();
          return 0;
        }
        localjv.rlq = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */