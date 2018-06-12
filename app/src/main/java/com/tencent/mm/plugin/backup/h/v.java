package com.tencent.mm.plugin.backup.h;

public final class v
  extends com.tencent.mm.bk.a
{
  public String ID;
  public com.tencent.mm.bk.b hbs;
  public int hcC;
  public int hcD;
  public int hcE;
  public int hcF;
  public int hcG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new f.a.a.b("Not all required fields were included: ID");
      }
      paramVarArgs.fT(1, this.hcC);
      if (this.ID != null) {
        paramVarArgs.g(2, this.ID);
      }
      if (this.hbs != null) {
        paramVarArgs.b(3, this.hbs);
      }
      paramVarArgs.fT(4, this.hcD);
      paramVarArgs.fT(5, this.hcE);
      paramVarArgs.fT(6, this.hcF);
      paramVarArgs.fT(7, this.hcG);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.hcC) + 0;
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ID);
      }
      i = paramInt;
      if (this.hbs != null) {
        i = paramInt + f.a.a.a.a(3, this.hbs);
      }
      return i + f.a.a.a.fQ(4, this.hcD) + f.a.a.a.fQ(5, this.hcE) + f.a.a.a.fQ(6, this.hcF) + f.a.a.a.fQ(7, this.hcG);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.ID == null) {
        throw new f.a.a.b("Not all required fields were included: ID");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      v localv = (v)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localv.hcC = locala.vHC.rY();
        return 0;
      case 2: 
        localv.ID = locala.vHC.readString();
        return 0;
      case 3: 
        localv.hbs = locala.cJR();
        return 0;
      case 4: 
        localv.hcD = locala.vHC.rY();
        return 0;
      case 5: 
        localv.hcE = locala.vHC.rY();
        return 0;
      case 6: 
        localv.hcF = locala.vHC.rY();
        return 0;
      }
      localv.hcG = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/h/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */