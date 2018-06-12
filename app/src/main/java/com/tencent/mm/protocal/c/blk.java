package com.tencent.mm.protocal.c;

public final class blk
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rSu;
  public com.tencent.mm.bk.b skr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.skr == null) {
        throw new f.a.a.b("Not all required fields were included: Name");
      }
      if (this.rSu == null) {
        throw new f.a.a.b("Not all required fields were included: Value");
      }
      if (this.skr != null) {
        paramVarArgs.b(1, this.skr);
      }
      if (this.rSu != null) {
        paramVarArgs.b(2, this.rSu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.skr == null) {
        break label296;
      }
    }
    label296:
    for (paramInt = f.a.a.a.a(1, this.skr) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rSu != null) {
        i = paramInt + f.a.a.a.a(2, this.rSu);
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
        if (this.skr == null) {
          throw new f.a.a.b("Not all required fields were included: Name");
        }
        if (this.rSu != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: Value");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        blk localblk = (blk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localblk.skr = locala.cJR();
          return 0;
        }
        localblk.rSu = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/blk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */