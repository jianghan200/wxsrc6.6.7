package com.tencent.mm.protocal.c;

public final class avu
  extends com.tencent.mm.bk.a
{
  public int jQd;
  public String jTu;
  public String jTv;
  public int rci;
  public long rcq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jTv != null) {
        paramVarArgs.g(1, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(2, this.jTu);
      }
      paramVarArgs.fT(3, this.rci);
      paramVarArgs.fT(4, this.jQd);
      paramVarArgs.T(5, this.rcq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jTv == null) {
        break label343;
      }
    }
    label343:
    for (paramInt = f.a.a.b.b.a.h(1, this.jTv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jTu);
      }
      return i + f.a.a.a.fQ(3, this.rci) + f.a.a.a.fQ(4, this.jQd) + f.a.a.a.S(5, this.rcq);
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
        avu localavu = (avu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localavu.jTv = locala.vHC.readString();
          return 0;
        case 2: 
          localavu.jTu = locala.vHC.readString();
          return 0;
        case 3: 
          localavu.rci = locala.vHC.rY();
          return 0;
        case 4: 
          localavu.jQd = locala.vHC.rY();
          return 0;
        }
        localavu.rcq = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/avu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */