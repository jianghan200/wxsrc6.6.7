package com.tencent.mm.protocal.c;

public final class nh
  extends com.tencent.mm.bk.a
{
  public String rro;
  public String rrp;
  public String rrq;
  public int rrr;
  public int rrs;
  public String rrt;
  public int rru;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rro != null) {
        paramVarArgs.g(1, this.rro);
      }
      if (this.rrp != null) {
        paramVarArgs.g(2, this.rrp);
      }
      if (this.rrq != null) {
        paramVarArgs.g(3, this.rrq);
      }
      paramVarArgs.fT(4, this.rrr);
      paramVarArgs.fT(5, this.rrs);
      if (this.rrt != null) {
        paramVarArgs.g(6, this.rrt);
      }
      paramVarArgs.fT(7, this.rru);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rro == null) {
        break label461;
      }
    }
    label461:
    for (int i = f.a.a.b.b.a.h(1, this.rro) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rrp != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rrp);
      }
      i = paramInt;
      if (this.rrq != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rrq);
      }
      i = i + f.a.a.a.fQ(4, this.rrr) + f.a.a.a.fQ(5, this.rrs);
      paramInt = i;
      if (this.rrt != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rrt);
      }
      return paramInt + f.a.a.a.fQ(7, this.rru);
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
        nh localnh = (nh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localnh.rro = locala.vHC.readString();
          return 0;
        case 2: 
          localnh.rrp = locala.vHC.readString();
          return 0;
        case 3: 
          localnh.rrq = locala.vHC.readString();
          return 0;
        case 4: 
          localnh.rrr = locala.vHC.rY();
          return 0;
        case 5: 
          localnh.rrs = locala.vHC.rY();
          return 0;
        case 6: 
          localnh.rrt = locala.vHC.readString();
          return 0;
        }
        localnh.rru = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */