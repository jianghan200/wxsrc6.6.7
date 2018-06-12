package com.tencent.mm.protocal.c;

public final class cfs
  extends com.tencent.mm.bk.a
{
  public String sAk;
  public boolean sAl;
  public int sAm;
  public int sAn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sAk != null) {
        paramVarArgs.g(1, this.sAk);
      }
      paramVarArgs.av(2, this.sAl);
      paramVarArgs.fT(3, this.sAm);
      paramVarArgs.fT(4, this.sAn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sAk == null) {
        break label277;
      }
    }
    label277:
    for (paramInt = f.a.a.b.b.a.h(1, this.sAk) + 0;; paramInt = 0)
    {
      return paramInt + (f.a.a.b.b.a.ec(2) + 1) + f.a.a.a.fQ(3, this.sAm) + f.a.a.a.fQ(4, this.sAn);
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
        cfs localcfs = (cfs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcfs.sAk = locala.vHC.readString();
          return 0;
        case 2: 
          localcfs.sAl = locala.cJQ();
          return 0;
        case 3: 
          localcfs.sAm = locala.vHC.rY();
          return 0;
        }
        localcfs.sAn = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */