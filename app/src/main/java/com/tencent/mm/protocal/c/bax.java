package com.tencent.mm.protocal.c;

public final class bax
  extends com.tencent.mm.bk.a
{
  public String sdk;
  public String sdl;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sdk != null) {
        paramVarArgs.g(1, this.sdk);
      }
      if (this.sdl != null) {
        paramVarArgs.g(2, this.sdl);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sdk == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = f.a.a.b.b.a.h(1, this.sdk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sdl != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sdl);
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
        bax localbax = (bax)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbax.sdk = locala.vHC.readString();
          return 0;
        }
        localbax.sdl = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */