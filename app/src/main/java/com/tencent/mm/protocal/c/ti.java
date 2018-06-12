package com.tencent.mm.protocal.c;

public final class ti
  extends com.tencent.mm.bk.a
{
  public int Height;
  public int Width;
  public String ksv;
  public String rwG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ksv != null) {
        paramVarArgs.g(1, this.ksv);
      }
      paramVarArgs.fT(2, this.Width);
      paramVarArgs.fT(3, this.Height);
      if (this.rwG != null) {
        paramVarArgs.g(4, this.rwG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.ksv == null) {
        break label308;
      }
    }
    label308:
    for (paramInt = f.a.a.b.b.a.h(1, this.ksv) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.Width) + f.a.a.a.fQ(3, this.Height);
      paramInt = i;
      if (this.rwG != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwG);
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
        ti localti = (ti)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localti.ksv = locala.vHC.readString();
          return 0;
        case 2: 
          localti.Width = locala.vHC.rY();
          return 0;
        case 3: 
          localti.Height = locala.vHC.rY();
          return 0;
        }
        localti.rwG = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */