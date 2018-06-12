package com.tencent.mm.protocal.c;

public final class bll
  extends com.tencent.mm.bk.a
{
  public String nickname;
  public boolean sks;
  public String skt;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      paramVarArgs.av(2, this.sks);
      if (this.nickname != null) {
        paramVarArgs.g(3, this.nickname);
      }
      if (this.skt != null) {
        paramVarArgs.g(4, this.skt);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label321;
      }
    }
    label321:
    for (paramInt = f.a.a.b.b.a.h(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 1);
      paramInt = i;
      if (this.nickname != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.nickname);
      }
      i = paramInt;
      if (this.skt != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.skt);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bll localbll = (bll)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbll.username = locala.vHC.readString();
          return 0;
        case 2: 
          localbll.sks = locala.cJQ();
          return 0;
        case 3: 
          localbll.nickname = locala.vHC.readString();
          return 0;
        }
        localbll.skt = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */