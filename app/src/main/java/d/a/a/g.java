package d.a.a;

public final class g
  extends com.tencent.mm.bk.a
{
  public String lRX;
  public String vHo;
  public String vHp;
  public String vHq;
  public String vHr;
  public String vHs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lRX != null) {
        paramVarArgs.g(1, this.lRX);
      }
      if (this.vHo != null) {
        paramVarArgs.g(2, this.vHo);
      }
      if (this.vHp != null) {
        paramVarArgs.g(3, this.vHp);
      }
      if (this.vHq != null) {
        paramVarArgs.g(4, this.vHq);
      }
      if (this.vHr != null) {
        paramVarArgs.g(5, this.vHr);
      }
      if (this.vHs != null) {
        paramVarArgs.g(6, this.vHs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRX == null) {
        break label454;
      }
    }
    label454:
    for (int i = f.a.a.b.b.a.h(1, this.lRX) + 0;; i = 0)
    {
      paramInt = i;
      if (this.vHo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.vHo);
      }
      i = paramInt;
      if (this.vHp != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.vHp);
      }
      paramInt = i;
      if (this.vHq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.vHq);
      }
      i = paramInt;
      if (this.vHr != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.vHr);
      }
      paramInt = i;
      if (this.vHs != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.vHs);
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
        g localg = (g)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localg.lRX = locala.vHC.readString();
          return 0;
        case 2: 
          localg.vHo = locala.vHC.readString();
          return 0;
        case 3: 
          localg.vHp = locala.vHC.readString();
          return 0;
        case 4: 
          localg.vHq = locala.vHC.readString();
          return 0;
        case 5: 
          localg.vHr = locala.vHC.readString();
          return 0;
        }
        localg.vHs = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/d/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */