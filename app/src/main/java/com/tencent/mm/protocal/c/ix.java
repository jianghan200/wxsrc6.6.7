package com.tencent.mm.protocal.c;

import com.tencent.mm.ac.d;
import com.tencent.mm.storage.ab;
import f.a.a.b;

public final class ix
  extends com.tencent.mm.bk.a
{
  public ab guS;
  public d lUs;
  public String userName;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.userName == null) {
        throw new b("Not all required fields were included: userName");
      }
      if (this.userName != null) {
        paramVarArgs.g(1, this.userName);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.userName == null) {
        break label210;
      }
    }
    label210:
    for (paramInt = f.a.a.b.b.a.h(1, this.userName) + 0;; paramInt = 0)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.userName != null) {
          break;
        }
        throw new b("Not all required fields were included: userName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ix localix = (ix)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        }
        localix.userName = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */