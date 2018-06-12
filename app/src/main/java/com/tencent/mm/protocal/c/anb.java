package com.tencent.mm.protocal.c;

public final class anb
  extends com.tencent.mm.bk.a
{
  public int hcy;
  public String jPK;
  public String jPe;
  public String rwk;
  public String rxo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rxo != null) {
        paramVarArgs.g(1, this.rxo);
      }
      paramVarArgs.fT(2, this.hcy);
      if (this.rwk != null) {
        paramVarArgs.g(3, this.rwk);
      }
      if (this.jPK != null) {
        paramVarArgs.g(4, this.jPK);
      }
      if (this.jPe != null) {
        paramVarArgs.g(5, this.jPe);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rxo == null) {
        break label383;
      }
    }
    label383:
    for (paramInt = f.a.a.b.b.a.h(1, this.rxo) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcy);
      paramInt = i;
      if (this.rwk != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rwk);
      }
      i = paramInt;
      if (this.jPK != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jPK);
      }
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jPe);
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
        anb localanb = (anb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localanb.rxo = locala.vHC.readString();
          return 0;
        case 2: 
          localanb.hcy = locala.vHC.rY();
          return 0;
        case 3: 
          localanb.rwk = locala.vHC.readString();
          return 0;
        case 4: 
          localanb.jPK = locala.vHC.readString();
          return 0;
        }
        localanb.jPe = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/anb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */