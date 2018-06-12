package com.tencent.mm.protocal.c;

public final class bvs
  extends com.tencent.mm.bk.a
{
  public int rdV;
  public int rdW;
  public String rwt;
  public com.tencent.mm.bk.b ssk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ssk == null) {
        throw new f.a.a.b("Not all required fields were included: EmojiBuffer");
      }
      if (this.rwt != null) {
        paramVarArgs.g(1, this.rwt);
      }
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      if (this.ssk != null) {
        paramVarArgs.b(4, this.ssk);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwt == null) {
        break label341;
      }
    }
    label341:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwt) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV);
      paramInt = i;
      if (this.ssk != null) {
        paramInt = i + f.a.a.a.a(4, this.ssk);
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
        if (this.ssk != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: EmojiBuffer");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bvs localbvs = (bvs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbvs.rwt = locala.vHC.readString();
          return 0;
        case 2: 
          localbvs.rdW = locala.vHC.rY();
          return 0;
        case 3: 
          localbvs.rdV = locala.vHC.rY();
          return 0;
        }
        localbvs.ssk = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */