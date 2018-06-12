package com.tencent.mm.protocal.c;

public final class ccg
  extends com.tencent.mm.bk.a
{
  public String eJQ;
  public String syk;
  public int syl;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.syk != null) {
        paramVarArgs.g(1, this.syk);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(2, this.eJQ);
      }
      paramVarArgs.fT(3, this.syl);
      return 0;
    }
    if (paramInt == 1) {
      if (this.syk == null) {
        break label269;
      }
    }
    label269:
    for (paramInt = f.a.a.b.b.a.h(1, this.syk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.eJQ);
      }
      return i + f.a.a.a.fQ(3, this.syl);
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
        ccg localccg = (ccg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localccg.syk = locala.vHC.readString();
          return 0;
        case 2: 
          localccg.eJQ = locala.vHC.readString();
          return 0;
        }
        localccg.syl = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ccg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */