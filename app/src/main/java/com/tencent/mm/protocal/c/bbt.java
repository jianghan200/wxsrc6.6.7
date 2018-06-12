package com.tencent.mm.protocal.c;

public final class bbt
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public String seb;
  public int sec;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bSc != null) {
        paramVarArgs.g(1, this.bSc);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.seb != null) {
        paramVarArgs.g(3, this.seb);
      }
      paramVarArgs.fT(4, this.sec);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bSc == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.bSc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.seb != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.seb);
      }
      return i + f.a.a.a.fQ(4, this.sec);
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
        bbt localbbt = (bbt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbbt.bSc = locala.vHC.readString();
          return 0;
        case 2: 
          localbbt.url = locala.vHC.readString();
          return 0;
        case 3: 
          localbbt.seb = locala.vHC.readString();
          return 0;
        }
        localbbt.sec = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */