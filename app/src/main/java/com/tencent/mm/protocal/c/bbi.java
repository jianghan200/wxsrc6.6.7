package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbi
  extends bhp
{
  public String content;
  public String hwH;
  public boolean hxo;
  public String qZY;
  public String qZZ;
  public String sdu;
  public String sdv;
  public String sdw;
  public String sdx;
  public String sdy;
  public int status;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.qZY != null) {
        paramVarArgs.g(2, this.qZY);
      }
      if (this.qZZ != null) {
        paramVarArgs.g(3, this.qZZ);
      }
      paramVarArgs.fT(4, this.status);
      if (this.content != null) {
        paramVarArgs.g(5, this.content);
      }
      if (this.hwH != null) {
        paramVarArgs.g(6, this.hwH);
      }
      if (this.sdu != null) {
        paramVarArgs.g(7, this.sdu);
      }
      paramVarArgs.av(8, this.hxo);
      if (this.sdv != null) {
        paramVarArgs.g(9, this.sdv);
      }
      if (this.sdw != null) {
        paramVarArgs.g(10, this.sdw);
      }
      if (this.sdx != null) {
        paramVarArgs.g(11, this.sdx);
      }
      if (this.sdy != null) {
        paramVarArgs.g(12, this.sdy);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label855;
      }
    }
    label855:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.qZY != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.qZY);
      }
      i = paramInt;
      if (this.qZZ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.qZZ);
      }
      i += f.a.a.a.fQ(4, this.status);
      paramInt = i;
      if (this.content != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.content);
      }
      i = paramInt;
      if (this.hwH != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.hwH);
      }
      paramInt = i;
      if (this.sdu != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sdu);
      }
      i = paramInt + (f.a.a.b.b.a.ec(8) + 1);
      paramInt = i;
      if (this.sdv != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.sdv);
      }
      i = paramInt;
      if (this.sdw != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.sdw);
      }
      paramInt = i;
      if (this.sdx != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.sdx);
      }
      i = paramInt;
      if (this.sdy != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.sdy);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bbi localbbi = (bbi)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbbi.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbbi.qZY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbbi.qZZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbbi.status = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbbi.content = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbbi.hwH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbbi.sdu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbbi.hxo = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 9: 
          localbbi.sdv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbbi.sdw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbbi.sdx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbbi.sdy = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */