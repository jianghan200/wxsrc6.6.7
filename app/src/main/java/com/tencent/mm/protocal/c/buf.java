package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class buf
  extends com.tencent.mm.bk.a
{
  public b srD;
  public String srE;
  public b srF;
  public int uin;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.srD != null) {
        paramVarArgs.b(1, this.srD);
      }
      if (this.srE != null) {
        paramVarArgs.g(2, this.srE);
      }
      if (this.srF != null) {
        paramVarArgs.b(3, this.srF);
      }
      paramVarArgs.fT(4, this.uin);
      return 0;
    }
    if (paramInt == 1) {
      if (this.srD == null) {
        break label318;
      }
    }
    label318:
    for (int i = f.a.a.a.a(1, this.srD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.srE != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.srE);
      }
      i = paramInt;
      if (this.srF != null) {
        i = paramInt + f.a.a.a.a(3, this.srF);
      }
      return i + f.a.a.a.fQ(4, this.uin);
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
        buf localbuf = (buf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbuf.srD = locala.cJR();
          return 0;
        case 2: 
          localbuf.srE = locala.vHC.readString();
          return 0;
        case 3: 
          localbuf.srF = locala.cJR();
          return 0;
        }
        localbuf.uin = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/buf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */