package com.tencent.mm.protocal.c;

public final class bnb
  extends com.tencent.mm.bk.a
{
  public int Height;
  public int Width;
  public String rwt;
  public String siz;
  public String sle;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwt != null) {
        paramVarArgs.g(1, this.rwt);
      }
      paramVarArgs.fT(2, this.Width);
      paramVarArgs.fT(3, this.Height);
      if (this.siz != null) {
        paramVarArgs.g(4, this.siz);
      }
      if (this.sle != null) {
        paramVarArgs.g(5, this.sle);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwt == null) {
        break label363;
      }
    }
    label363:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwt) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.Width) + f.a.a.a.fQ(3, this.Height);
      paramInt = i;
      if (this.siz != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.siz);
      }
      i = paramInt;
      if (this.sle != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sle);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bnb localbnb = (bnb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbnb.rwt = locala.vHC.readString();
          return 0;
        case 2: 
          localbnb.Width = locala.vHC.rY();
          return 0;
        case 3: 
          localbnb.Height = locala.vHC.rY();
          return 0;
        case 4: 
          localbnb.siz = locala.vHC.readString();
          return 0;
        }
        localbnb.sle = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */