package d.a.a;

public final class f
  extends com.tencent.mm.bk.a
{
  public String sbY;
  public String sbZ;
  public int sca;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sbY != null) {
        paramVarArgs.g(1, this.sbY);
      }
      if (this.sbZ != null) {
        paramVarArgs.g(2, this.sbZ);
      }
      paramVarArgs.fT(3, this.sca);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sbY == null) {
        break label269;
      }
    }
    label269:
    for (paramInt = f.a.a.b.b.a.h(1, this.sbY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sbZ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sbZ);
      }
      return i + f.a.a.a.fQ(3, this.sca);
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
        f localf = (f)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localf.sbY = locala.vHC.readString();
          return 0;
        case 2: 
          localf.sbZ = locala.vHC.readString();
          return 0;
        }
        localf.sca = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/d/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */