package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class biq
  extends bhd
{
  public String bPS;
  public int rZH;
  public LinkedList<String> rZI = new LinkedList();
  public String sjf;
  public String state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rZH);
      paramVarArgs.d(4, 1, this.rZI);
      if (this.bPS != null) {
        paramVarArgs.g(5, this.bPS);
      }
      if (this.state != null) {
        paramVarArgs.g(6, this.state);
      }
      if (this.sjf != null) {
        paramVarArgs.g(7, this.sjf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label536;
      }
    }
    label536:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(3, this.rZH) + f.a.a.a.c(4, 1, this.rZI);
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.bPS);
      }
      i = paramInt;
      if (this.state != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.state);
      }
      paramInt = i;
      if (this.sjf != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sjf);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rZI.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        biq localbiq = (biq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 2: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbiq.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbiq.rZH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbiq.rZI.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 5: 
          localbiq.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbiq.state = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbiq.sjf = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/biq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */