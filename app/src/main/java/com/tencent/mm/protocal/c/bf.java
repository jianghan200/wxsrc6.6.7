package com.tencent.mm.protocal.c;

public final class bf
  extends com.tencent.mm.bk.a
{
  public long endTime;
  public int niG;
  public int niH;
  public long rbA;
  public long rbB;
  public float rbv;
  public float rbw;
  public float rbx;
  public long rby;
  public long rbz;
  public long startTime;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.niG);
      paramVarArgs.fT(2, this.niH);
      paramVarArgs.l(3, this.rbv);
      paramVarArgs.l(4, this.rbw);
      paramVarArgs.l(5, this.rbx);
      paramVarArgs.T(6, this.startTime);
      paramVarArgs.T(7, this.endTime);
      paramVarArgs.T(8, this.rby);
      paramVarArgs.T(9, this.rbz);
      paramVarArgs.T(10, this.rbA);
      paramVarArgs.T(11, this.rbB);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.niG) + 0 + f.a.a.a.fQ(2, this.niH) + (f.a.a.b.b.a.ec(3) + 4) + (f.a.a.b.b.a.ec(4) + 4) + (f.a.a.b.b.a.ec(5) + 4) + f.a.a.a.S(6, this.startTime) + f.a.a.a.S(7, this.endTime) + f.a.a.a.S(8, this.rby) + f.a.a.a.S(9, this.rbz) + f.a.a.a.S(10, this.rbA) + f.a.a.a.S(11, this.rbB);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bf localbf = (bf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbf.niG = locala.vHC.rY();
        return 0;
      case 2: 
        localbf.niH = locala.vHC.rY();
        return 0;
      case 3: 
        localbf.rbv = locala.vHC.readFloat();
        return 0;
      case 4: 
        localbf.rbw = locala.vHC.readFloat();
        return 0;
      case 5: 
        localbf.rbx = locala.vHC.readFloat();
        return 0;
      case 6: 
        localbf.startTime = locala.vHC.rZ();
        return 0;
      case 7: 
        localbf.endTime = locala.vHC.rZ();
        return 0;
      case 8: 
        localbf.rby = locala.vHC.rZ();
        return 0;
      case 9: 
        localbf.rbz = locala.vHC.rZ();
        return 0;
      case 10: 
        localbf.rbA = locala.vHC.rZ();
        return 0;
      }
      localbf.rbB = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */