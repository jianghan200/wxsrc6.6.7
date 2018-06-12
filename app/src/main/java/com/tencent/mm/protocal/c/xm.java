package com.tencent.mm.protocal.c;

public final class xm
  extends com.tencent.mm.bk.a
{
  public int bMH;
  public String id;
  public int jkI;
  public String rDq;
  public long rDr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.g(1, this.id);
      }
      paramVarArgs.fT(2, this.jkI);
      if (this.rDq != null) {
        paramVarArgs.g(3, this.rDq);
      }
      paramVarArgs.T(4, this.rDr);
      paramVarArgs.fT(5, this.bMH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label347;
      }
    }
    label347:
    for (paramInt = f.a.a.b.b.a.h(1, this.id) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jkI);
      paramInt = i;
      if (this.rDq != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rDq);
      }
      return paramInt + f.a.a.a.S(4, this.rDr) + f.a.a.a.fQ(5, this.bMH);
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
        xm localxm = (xm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localxm.id = locala.vHC.readString();
          return 0;
        case 2: 
          localxm.jkI = locala.vHC.rY();
          return 0;
        case 3: 
          localxm.rDq = locala.vHC.readString();
          return 0;
        case 4: 
          localxm.rDr = locala.vHC.rZ();
          return 0;
        }
        localxm.bMH = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/xm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */