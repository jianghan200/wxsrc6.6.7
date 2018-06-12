package com.tencent.mm.protocal.c;

public final class chg
  extends com.tencent.mm.bk.a
{
  public String path;
  public String rYG;
  public int rkb;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      if (this.rYG != null) {
        paramVarArgs.g(2, this.rYG);
      }
      paramVarArgs.fT(3, this.rkb);
      if (this.path != null) {
        paramVarArgs.g(4, this.path);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label328;
      }
    }
    label328:
    for (paramInt = f.a.a.b.b.a.h(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rYG != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rYG);
      }
      i += f.a.a.a.fQ(3, this.rkb);
      paramInt = i;
      if (this.path != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.path);
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
        chg localchg = (chg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localchg.username = locala.vHC.readString();
          return 0;
        case 2: 
          localchg.rYG = locala.vHC.readString();
          return 0;
        case 3: 
          localchg.rkb = locala.vHC.rY();
          return 0;
        }
        localchg.path = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/chg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */