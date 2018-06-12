package com.tencent.mm.protocal.a.a;

public final class d
  extends com.tencent.mm.bk.a
{
  public int count;
  public int mXw;
  public int qXg;
  public com.tencent.mm.bk.b qXp;
  public int qXq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.qXp == null) {
        throw new f.a.a.b("Not all required fields were included: value");
      }
      paramVarArgs.fT(1, this.qXg);
      if (this.qXp != null) {
        paramVarArgs.b(2, this.qXp);
      }
      paramVarArgs.fT(3, this.qXq);
      paramVarArgs.fT(4, this.mXw);
      paramVarArgs.fT(5, this.count);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.qXg) + 0;
      paramInt = i;
      if (this.qXp != null) {
        paramInt = i + f.a.a.a.a(2, this.qXp);
      }
      return paramInt + f.a.a.a.fQ(3, this.qXq) + f.a.a.a.fQ(4, this.mXw) + f.a.a.a.fQ(5, this.count);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.qXp == null) {
        throw new f.a.a.b("Not all required fields were included: value");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locald.qXg = locala.vHC.rY();
        return 0;
      case 2: 
        locald.qXp = locala.cJR();
        return 0;
      case 3: 
        locald.qXq = locala.vHC.rY();
        return 0;
      case 4: 
        locald.mXw = locala.vHC.rY();
        return 0;
      }
      locald.count = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */