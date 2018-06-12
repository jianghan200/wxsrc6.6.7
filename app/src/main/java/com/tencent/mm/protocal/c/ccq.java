package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class ccq
  extends com.tencent.mm.bk.a
{
  public b syp;
  public b syq;
  public b syr;
  public b sys;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.syp != null) {
        paramVarArgs.b(1, this.syp);
      }
      if (this.syq != null) {
        paramVarArgs.b(2, this.syq);
      }
      if (this.syr != null) {
        paramVarArgs.b(3, this.syr);
      }
      if (this.sys != null) {
        paramVarArgs.b(4, this.sys);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.syp == null) {
        break label332;
      }
    }
    label332:
    for (int i = f.a.a.a.a(1, this.syp) + 0;; i = 0)
    {
      paramInt = i;
      if (this.syq != null) {
        paramInt = i + f.a.a.a.a(2, this.syq);
      }
      i = paramInt;
      if (this.syr != null) {
        i = paramInt + f.a.a.a.a(3, this.syr);
      }
      paramInt = i;
      if (this.sys != null) {
        paramInt = i + f.a.a.a.a(4, this.sys);
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
        ccq localccq = (ccq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localccq.syp = locala.cJR();
          return 0;
        case 2: 
          localccq.syq = locala.cJR();
          return 0;
        case 3: 
          localccq.syr = locala.cJR();
          return 0;
        }
        localccq.sys = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ccq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */