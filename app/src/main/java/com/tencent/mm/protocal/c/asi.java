package com.tencent.mm.protocal.c;

public final class asi
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public int otY;
  public int rRb;
  public int rUA;
  public int rUB;
  public String rUC;
  public int rUD;
  public int riv;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      if (this.username != null) {
        paramVarArgs.g(2, this.username);
      }
      paramVarArgs.fT(3, this.rRb);
      paramVarArgs.fT(4, this.riv);
      paramVarArgs.fT(5, this.otY);
      paramVarArgs.fT(6, this.rUA);
      paramVarArgs.fT(7, this.rUB);
      if (this.rUC != null) {
        paramVarArgs.g(8, this.rUC);
      }
      paramVarArgs.fT(9, this.rUD);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label519;
      }
    }
    label519:
    for (paramInt = f.a.a.b.b.a.h(1, this.bPS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.username != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.username);
      }
      i = i + f.a.a.a.fQ(3, this.rRb) + f.a.a.a.fQ(4, this.riv) + f.a.a.a.fQ(5, this.otY) + f.a.a.a.fQ(6, this.rUA) + f.a.a.a.fQ(7, this.rUB);
      paramInt = i;
      if (this.rUC != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rUC);
      }
      return paramInt + f.a.a.a.fQ(9, this.rUD);
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
        asi localasi = (asi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localasi.bPS = locala.vHC.readString();
          return 0;
        case 2: 
          localasi.username = locala.vHC.readString();
          return 0;
        case 3: 
          localasi.rRb = locala.vHC.rY();
          return 0;
        case 4: 
          localasi.riv = locala.vHC.rY();
          return 0;
        case 5: 
          localasi.otY = locala.vHC.rY();
          return 0;
        case 6: 
          localasi.rUA = locala.vHC.rY();
          return 0;
        case 7: 
          localasi.rUB = locala.vHC.rY();
          return 0;
        case 8: 
          localasi.rUC = locala.vHC.readString();
          return 0;
        }
        localasi.rUD = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/asi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */