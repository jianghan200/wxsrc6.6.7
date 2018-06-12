package com.tencent.mm.plugin.backup.h;

public final class ae
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b hbs;
  public String hcI;
  public int hcJ;
  public int hcL;
  public int hcM;
  public int hcN;
  public int hcd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hcI == null) {
        throw new f.a.a.b("Not all required fields were included: DataID");
      }
      if (this.hcI != null) {
        paramVarArgs.g(1, this.hcI);
      }
      paramVarArgs.fT(2, this.hcJ);
      paramVarArgs.fT(3, this.hcL);
      paramVarArgs.fT(4, this.hcM);
      paramVarArgs.fT(5, this.hcd);
      paramVarArgs.fT(6, this.hcN);
      if (this.hbs != null) {
        paramVarArgs.b(7, this.hbs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hcI == null) {
        break label454;
      }
    }
    label454:
    for (paramInt = f.a.a.b.b.a.h(1, this.hcI) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcJ) + f.a.a.a.fQ(3, this.hcL) + f.a.a.a.fQ(4, this.hcM) + f.a.a.a.fQ(5, this.hcd) + f.a.a.a.fQ(6, this.hcN);
      paramInt = i;
      if (this.hbs != null) {
        paramInt = i + f.a.a.a.a(7, this.hbs);
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
        if (this.hcI != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: DataID");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ae localae = (ae)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localae.hcI = locala.vHC.readString();
          return 0;
        case 2: 
          localae.hcJ = locala.vHC.rY();
          return 0;
        case 3: 
          localae.hcL = locala.vHC.rY();
          return 0;
        case 4: 
          localae.hcM = locala.vHC.rY();
          return 0;
        case 5: 
          localae.hcd = locala.vHC.rY();
          return 0;
        case 6: 
          localae.hcN = locala.vHC.rY();
          return 0;
        }
        localae.hbs = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/h/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */